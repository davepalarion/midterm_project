#!/bin/bash
mkdir tempdir
mkdir tempdir/templates

cp app.py tempdir/.
cp -r templates/* tempdir/templates/.

echo "FROM python" > tempdir/Dockerfile
echo "RUN pip install flask" >> tempdir/Dockerfile


echo "COPY ./templates /home/devasc/Desktop/app/templates/" >> tempdir/Dockerfile
echo "COPY app.py /home/devasc/Desktop/app/" >> tempdir/Dockerfile

echo "EXPOSE 8080" >> tempdir/Dockerfile
echo "CMD python3 /home/devasc/Desktop/app.py" >> tempdir/Dockerfile

cd tempdir
docker build -t app .

docker run -t -d -p 8080:8080 --name samplerunning app
docker ps -a
