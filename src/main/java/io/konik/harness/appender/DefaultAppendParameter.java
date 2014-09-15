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
package io.konik.harness.appender;

import java.io.InputStream;
import java.io.OutputStream;

import io.konik.harness.AppendParameter;

/**
 * A Default Append Parameter.
 */
public class DefaultAppendParameter implements AppendParameter {

   InputStream inputPdf;
   InputStream attachmentFile;
   OutputStream resultingPdf;
   String zugferdVersion;
   String zugferdConformanceLevel;

   /**
    * Instantiates a new default append parameter.
    *
    * @param inputPdf the input pdf
    * @param attachmentFile the attachment file
    * @param resultingPdf the resulting pdf
    * @param zugferdVersion the zugferd version
    * @param zugferdConformanceLevel the zugferd conformance level
    */
   public DefaultAppendParameter(InputStream inputPdf, InputStream attachmentFile, OutputStream resultingPdf,
         String zugferdVersion, String zugferdConformanceLevel) {
      super();
      this.inputPdf = inputPdf;
      this.attachmentFile = attachmentFile;
      this.resultingPdf = resultingPdf;
      this.zugferdVersion = zugferdVersion;
      this.zugferdConformanceLevel = zugferdConformanceLevel;
   }

   @Override
   public InputStream inputPdf() {
      return inputPdf;
   }

   @Override
   public OutputStream resultingPdf() {
      return resultingPdf;
   }

   @Override
   public InputStream attachmentFile() {
      return attachmentFile;
   }

   @Override
   public String zugferdVersion() {
      return zugferdVersion;
   }

   @Override
   public String zugferdConformanceLevel() {
      return zugferdConformanceLevel;
   }

}
