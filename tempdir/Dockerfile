FROM python
RUN pip install flask
COPY  ./templates /home/myapp/templates/
COPY  project-app.py /home/myapp/
EXPOSE 8080
CMD python3 /home/myapp/project-app.py
