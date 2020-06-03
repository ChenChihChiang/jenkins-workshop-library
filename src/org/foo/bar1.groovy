package org.foo

class utils1 implements Serializable {
	
	String getGitCommitId() {
		return sh(returnStdout: true, script: 'git rev-parse HEAD').trim()
	}
}
