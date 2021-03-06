/*******************************************************************************
 Copyright 2012 Benjamin Fagin

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.


     Read the included LICENSE.TXT for more information.
 ******************************************************************************/

package unquietcode.tools.flapi;

import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.writer.FileCodeWriter;
import com.sun.codemodel.writer.SingleStreamCodeWriter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Ben Fagin
 * @version 03-10-2012
 */
public class CodeWriter {

	public static void writeToStream(JCodeModel model, OutputStream stream) {
		SingleStreamCodeWriter writer = new SingleStreamCodeWriter(stream);

		try {
			model.build(writer);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}

		System.out.println(stream.toString());
	}

	public static void writeToDirectory(JCodeModel model, File directory) {
		try {
			FileCodeWriter fileWriter = new FileCodeWriter(directory, false);
			model.build(fileWriter);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
