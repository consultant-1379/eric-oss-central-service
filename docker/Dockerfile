FROM armdocker.rnd.ericsson.se/proj-eson-3pp/ecson-wildfly-base:1.0.19

COPY ./eric-oss-central-service-ear/target/*.ear /ericsson/3pp/wildfly/standalone/deployments/

ARG COMMIT
ARG REPOSITORY
ARG APP_VERSION

LABEL \
    commit=$COMMIT \
    repository=$REPOSITORY\
    app.version=$APP_VERSION

EXPOSE 8080 9999 9990 8787