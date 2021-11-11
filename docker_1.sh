#!/bin/bash

mkdir tempdir
mkdir tempdir/templates

cp project-app.py tempdir/.
cp -r templates/* tempdir/templates/.


echo "FROM python" > tempdir/Dockerfile
echo "RUN pip install flask" >> tempdir/Dockerfile
echo "COPY  ./templates /home/myapp/templates/" >> tempdir/Dockerfile
echo "COPY  project-app.py /home/myapp/" >> tempdir/Dockerfile
echo "EXPOSE 8080" >> tempdir/Dockerfile
echo "CMD python3 /home/myapp/project-app.py" >> tempdir/Dockerfile

cd tempdir
docker build -t projectapp .
docker run -t -d -p 8080:8080 --name projectrunning projectapp
docker ps -a
