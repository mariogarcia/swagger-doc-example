package org.grails.plugins.swaggerdoc

import grails.rest.*

@Resource(uri="/domain", formats=["json"])
class Dummy {
    String name

    static constraints = {
    }
}
