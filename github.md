### 克隆仓库
git clone
### 添加缓存
git add . 
### 提交缓存的文件
git commit -m "注释"
### 添加仓库的哪个文件夹
git remote add 仓库名 仓库文件夹地址
### 提交到仓库
git push 仓库名 master

### 删除文件
git rm 我的文件
### 删除文件夹
git rm -r 我的文件夹
### 提交代码
git commit -m ""
### 提交仓库
git push 仓库名 master
### 不删除本地文件夹

touch .gitignore

vim .gitignore(输入文件路径)

git rm -r --cached .idea  #--cached不会把本地的.idea删除
git commit -m 'delete .idea dir'
git push -u origin master

### 创建release版本号

git tag -a '0.0.0.1' -m '第一个版本的tag'

* 查看本地tag

  git tag

* 添加到要远程仓库

  git push --tags   

### 更新文件

* git status
* git add .
* git commit -m “第二次提交代码”
* git push -u origin master
* git tag '0.0.2'
* git push origin 0.0.2

### 删除一个版本

* git tag -d 0.0.1
* git push origin :0.0.1

  

