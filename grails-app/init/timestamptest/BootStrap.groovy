package timestamptest

import demo.Person

class BootStrap {

    def init = { servletContext ->
         new Person(name: 'Jeff').save()
    }
    def destroy = {
    }
}
