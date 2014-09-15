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
import java.io.OutputStream;

/**
 * The PDF Append Parameter Data.
 */
public interface AppendParameter{
   
   /**
    * Input PDF to read from.
    * 
    * This file should not be altered.
    * @return the input stream of the PDF
    */
   InputStream inputPdf();
   
   /**
    * The Resulting PDF output Stream.
    *
    * @return the output stream of the PDF
    */
   OutputStream resultingPdf();
   
   /**
    * Attachment file.
    *
    * @return the input stream
    */
   InputStream attachmentFile();
   
   /**
    * Zugferd version.
    *
    * @return the string
    */
   String zugferdVersion();
   
   /**
    * Zugferd conformance level.
    *
    * @return the string
    */
   String zugferdConformanceLevel();
}
