/*
 Copyright (c) 2008 thePlatform, Inc.

This file is part of Cuanto, a test results repository and analysis program.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.

*/

package cuanto

class AnalysisState {

	String name
	Boolean isAnalyzed
	Boolean isDefault
	Boolean isBug

	static mapping = {
		cache usage:'read-only'
		//cache: 'nonstrict-read-write' // change to this if an interface is introduced to create AnalysisStates
	}

	
	String toString() {
		name
	}

}
