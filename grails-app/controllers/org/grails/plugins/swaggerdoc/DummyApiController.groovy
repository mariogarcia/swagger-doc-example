package org.grails.plugins.swaggerdoc

import grails.converters.JSON

class DummyApiController {
    def dummies = []

    def getDummy(String name) {
        def result = new Dummy(name: "test")
        render result as JSON
    }

    def insertDummy(String name) {
        dummies << new Dummy(name: name)
        response.status = 204
        render ""
    }

    def allDummies() {
        render dummies as JSON
    }
}
