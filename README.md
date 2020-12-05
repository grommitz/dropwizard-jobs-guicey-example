# Example usage of dropwizard-guicey with dropwizard-jobs.

Minimal example showing how to use dropwizard-guicey instead of dropwizard-guice to provide dependency injection for dropwizard-jobs.

Uses the following versions:

* Dropwizard 2
* dropwizard-jobs 4
* gropwizard-guicey 5

In brief:

* don't use GuiceJobsBundle

* create an "installer" class which registers your Job classes with guicey

* create the GuiceJobManager in the main run() method.

# How to use

* git clone
* mvn clean install
* ./run.sh