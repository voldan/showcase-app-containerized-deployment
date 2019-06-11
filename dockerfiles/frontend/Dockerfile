FROM node:8.16.0

ARG be_loadbalancer_ip

RUN apt-get update && apt-get install -y git && \
  git clone https://gitlab.com/voldan/bikeChampionship.git > /dev/null && \
  sed -i 's/192.168.4.11/$be_loadbalancer_ip/g' ./bikeChampionship/frontend/src/constants/constants.js
WORKDIR ./bikeChampionship/frontend/
RUN npm install
ENTRYPOINT ["npm", "start"]