/*
 * Copyright (C) 2026 The Project Lombok Authors.
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
package lombok.core;

public enum JacksonAnnotationType {
	JSON_POJO_BUILDER2("com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder"),
	JSON_POJO_BUILDER3("tools.jackson.databind.annotation.JsonPOJOBuilder"),
	JSON_DESERIALIZE2("com.fasterxml.jackson.databind.annotation.JsonDeserialize"),
	JSON_DESERIALIZE3("tools.jackson.databind.annotation.JsonDeserialize"),
	JSON_PROPERTY2("com.fasterxml.jackson.annotation.JsonProperty"),
	JSON_IGNORE2("com.fasterxml.jackson.annotation.JsonIgnore"),
	;
	
	private final String qualifiedName;
	private final String[] qualifiedNameStringArr;
	private final char[][] qualifiedNameCharArrArr;
	
	private JacksonAnnotationType(final String qualifiedName) {
		this.qualifiedName = qualifiedName;
		String[] parts = qualifiedName.split("\\.");
		this.qualifiedNameStringArr = parts;
		char[][] caa = new char[parts.length][];
		for (int i = 0; i < parts.length; i++) {
			caa[i] = parts[i].toCharArray();
		}
		this.qualifiedNameCharArrArr = caa;
	}
	
	public String getQualifiedName() {
		return qualifiedName;
	}
	
	// Do not modify the returned array.
	public String[] getQualifiedNameAsStringArray() {
		return qualifiedNameStringArr;
	}
	
	// Do not modify the returned array.
	public char[][] getQualifiednameAsCharArrayArray() {
		return qualifiedNameCharArrArr;
	}
}
