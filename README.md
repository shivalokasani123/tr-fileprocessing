# tr-fileprocessing

1. Checkout the git project from github and the link is "https://github.com/shivalokasani123/tr-fileprocessing.git"
2. Build the project and create docker image 
   2.1 mvn clean package docker:build
3. Run the docker image with command 
   3.1 docker -t run assignment/tr-fileprocessing
   3.2 docker -t run --env "inuput_file=<valid_input_file>" assignment/tr-fileprocessing
