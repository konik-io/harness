/*
 * Copyright 2014 Konik.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.konik.harness;

import java.io.InputStream;

/**
 * 
 * Extracts the attachment file from a given PDF.
 */
public interface FileExtractor {
   
   /**
    * Extract from PDF Input Stream
    *
    * @param pdfInput the pdf input
    * @return the byte[]
    */
   byte[] extract(InputStream pdfInput);
   
   
   /**
    * Extract from PDF into Input Stream.
    * 
    * The caller is responsible to close the InputStream after finishing reading.
    *
    * @param pdfInput the pdf input stream
    * @return the input stream
    */
    InputStream extractToStream(InputStream pdfInput);
}
