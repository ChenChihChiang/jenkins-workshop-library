package org.foo
import org.foo.utils1

    class utils implements Serializable {

        def host1 = "Rico"
        def host2 = "John"
        def topic = "jenkins-workshop"
        def organizer = "devops"
        def date = "2020-06-21"
        
        def showhost() {
            return "host1 = ${host1}"
        }
        
        def showcommitid() {
            return utils1.getGitCommitId()
        }
        
        def getVersion(String BUILD_NUMBER, String GIT_COMMIT) {
            return "Build_Number: ${BUILD_NUMBER}, Git_Commit: ${GIT_COMMIT}"
    	}
    }
