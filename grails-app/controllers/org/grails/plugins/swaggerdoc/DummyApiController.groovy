package org.grails.plugins.swaggerdoc

import grails.converters.JSON

class DummyApiController {
    def show(Long id) {
        def result = Dummy.get(id)
        render result as JSON
    }

    def save(String name) {
        def result = new Dummy(name:name).save()
        response.status = 204
        render result as JSON
    }

    def index() {
        render Dummy.list() as JSON
    }
}
