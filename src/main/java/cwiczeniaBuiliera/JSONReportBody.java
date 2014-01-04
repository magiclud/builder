/**
 * Copyright 2011 Joao Miguel Pereira
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package cwiczeniaBuiliera;


/**
 * For training purposes only!
 * @author jpereira
 *
 */
public class JSONReportBody implements ReportBody {

	private Report report;
	private ReportBody reportBody;

	public JSONReportBody() {
		report = new Report();
	}

	private StringBuilder stringBuilder = new StringBuilder();
	/* (non-Javadoc)
	 * @see eu.jpereira.trainings.designpatterns.creational.builder.ReportBody#getAsString()
	 */
	@Override
	public Object getAsString() {
		return this.stringBuilder.toString();
	}

	/**
	 * @param content
	 */
	public void addContent(String content) {
		stringBuilder.append(content);
		
	}

	@Override
	public void buildReportBody() {
		report.setReportBody(reportBody);// null

	}

	@Override
	public Report getReport() {
		// TODO Auto-generated method stub
		return report;
	}
	

}
