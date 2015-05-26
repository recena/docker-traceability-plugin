/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015, CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.jenkinsci.plugins.docker.traceability.test;

import hudson.model.Fingerprint;
import hudson.model.Run;
import java.io.IOException;
import org.jenkinsci.plugins.docker.commons.fingerprint.DockerFingerprints;

/**
 * Helper methods for unit tests.
 * @author Oleg Nenashev
 */
public class FingerprintTestUtil {
    
    /**
     * Injects a {@link Fingerprint} and reference facets to the specified run.
     * @param run Run to be modified
     * @param imageId Image id
     * @throws IOException Error
     */
    public static void injectFromFacet (Run run, String imageId) throws IOException {
        DockerFingerprints.addFromFacet(null, imageId, run);
    }
}