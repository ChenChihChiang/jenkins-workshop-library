package org.foo

class utils1 implements Serializable {

  private final def script

  utils1(def script) {
    this.script = script
  }

  String commitMessage() {
    //return trimOutput("git log --format=%B -n 1 HEAD | head -n 1", 180)
    return "git log --format=%B -n 1 HEAD | head -n 1"
  }

  String commitAuthor() {
    trimOutput("git log --format=\'%an\' -n 1 HEAD", 80)
  }

  String commitHash() {
    trimOutput( ${GIT_COMMIT}, 7)
  }

  private String trimOutput(String script, int maxLength) {
    String content = this.script.sh(script: script, returnStdout: true)
    content.substring(0, Math.min(maxLength, content.length())).trim()
  }

  boolean isMasterBranch() {
    script.env.BRANCH_NAME == 'master'
  }

}
