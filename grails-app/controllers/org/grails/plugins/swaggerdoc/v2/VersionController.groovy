package org.grails.plugins.swaggerdoc.v2

import grails.converters.JSON

class VersionController {
    static namespace = "v2"

    def index() {
        def result = ["response": "I'm the second version"]
        render result as JSON
    }
}
