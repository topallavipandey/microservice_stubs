# microservice_stubs
installation steps jenkins
install java------
sudo yum install java-1.8.0-openjdk-devel
java -version
enable the Jenkins repository-------
curl --silent --location http://pkg.jenkins-ci.org/redhat-stable/jenkins.repo | sudo tee /etc/yum.repos.d/jenkins.repo
add the repository to your system-----
sudo rpm --import https://jenkins-ci.org/redhat/jenkins-ci.org.key
install jenkins----
sudo yum install jenkins
start the service----
sudo service start jenkins
enable jenkins so that it srats automatically as a service----
sudo systemctl enable jenkins
get the password-----
sudo cat /var/lib/jenkins/secrets/initialAdminPassword


====================================linux cmds==========================================================
ssh -i rp.pem centos@13.210.19.246

cat
ls
sudo
yum 
yum install
rpm
service 
systemctl
curl

=================================================== github================================================




