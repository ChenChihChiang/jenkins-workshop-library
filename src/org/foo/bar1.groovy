package org.foo

String getGitCommitId() {
	return sh(returnStdout: true, script: 'git rev-parse HEAD').trim()
}
