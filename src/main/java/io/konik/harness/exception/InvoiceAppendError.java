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
package io.konik.harness.exception;

/**
 * The Invoice Append Runtime Exception is thrown whenever something goes wrong during the invoice to PDF appending
 * process.
 * 
 */
public class InvoiceAppendError extends RuntimeException {

   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = -934899512930010703L;

   /**
    * Instantiates a new invoice append error.
    *
    * @param msg the message
    */
   public InvoiceAppendError(String msg) {
      super(msg);
   }

   /**
    * Instantiates a new invoice append error.
    *
    * @param msg the message
    * @param e the e
    */
   public InvoiceAppendError(String msg, Throwable e) {
      super(msg, e);
   }
}
