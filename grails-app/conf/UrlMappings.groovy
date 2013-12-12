class UrlMappings {
    static mappings = {
        "/api/dummy/$name" { controller = 'dummyApi'; action = [GET:'getDummy'] }
        "/api/dummy" { controller = 'dummyApi'; action = [GET:'allDummies', POST:'insertDummy'] }
        "/"(view:"/index")
        "500"(view:'/error')
    }
}
