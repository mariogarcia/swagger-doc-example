package org.grails.plugins.swaggerdoc.v1

import grails.converters.JSON

class VersionController {
    static namespace = "v1"

    def index() {
        def result = ["response": "I'm the first version"]
        render result as JSON
    }
}
