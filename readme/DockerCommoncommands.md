docker --help    #Docker帮助

docker --version   #查看Docker版本

docker search <image>  #搜索镜像文件，如：docker search mysql

docker pull <image>  #拉取镜像文件， 如：docker pull mysql

docker images    #查看已经拉取下来的所以镜像文件

docker rmi <image>  #删除指定镜像文件

docker run --name <name> -p 80:8080 -d <image>  #发布指定镜像文件

docker ps     #查看正在运行的所有镜像

docker ps -a    #查看所有发布的镜像

docker rm <image>   #删除执行已发布的镜像
