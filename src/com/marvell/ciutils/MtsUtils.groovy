package com.marvell.ciutils

class MtsUtils{
  def env
  
  MtsUtils(env){
    this.env = env
    }
  
  def startBuild(){
    print """
             box_name is ${env.BOX_NAME}
             box branch is ${env.BOX_BRANCH}
             build_type is ${env.BUILD_TYPE}
      """
    //send to the .pl these three vars
      echo new File('//fileril103/dev/TOOLS/cc1tools/utils/auto_compile_git/Start_Build_Bx.pl').text
  }
}
