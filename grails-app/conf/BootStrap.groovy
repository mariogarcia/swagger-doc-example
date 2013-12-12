import org.grails.plugins.swaggerdoc.Dummy

class BootStrap {
    def init = { servletContext ->
        new Dummy(name: "foo").save()
        new Dummy(name: "otherfoo").save()
    }
    def destroy = {
    }
}
