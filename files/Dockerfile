FROM ctfhub/base_web_tomcat_8u121

COPY _files /tmp/files

RUN adduser -D -h /home/user user
RUN mkdir /home/user/app

RUN apk update && \
    apk add --no-cache curl && \
    rm -rf /etc/apk/* /var/cache/apk/* /usr/share/man && \
    mv /tmp/files/flag /flag && \
    chmod 444 /flag && \
    mv /tmp/files/ctf.jar /home/user/app/ctf.jar && \
    mv /tmp/files/run.sh /run.sh && \
    chmod +x /run.sh && \
    rm -rf /tmp/*

USER user

CMD ["/run.sh"]
