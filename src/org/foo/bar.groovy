package org.foo

    class utils implements Serializable {

        host1 = "Rico";
  		host2 = "John";
  		topic = "jenkins-workshop";
  		organizer = "devops";
  		date = "2020-06-21";
      

  		def showcommitid() {
            println "host1 = ${host1}";
        }
        
  		def showcommitid() {
  			getGitCommitId();
        }
        
    	def getVersion(String BUILD_NUMBER, String GIT_COMMIT) {
    		return "Build_Number: ${BUILD_NUMBER}, Git_Commit: ${GIT_COMMIT}"
    	}
    }
