class UrlMappings {
    static mappings = {
        "/api/dummy" (resources:"dummyApi")

        "/api/version" (version: "1.0", resources:"version", namespace: "v1")
        "/api/version" (version: "2.0", resources:"version", namespace: "v2")

        "/"(view:"/index")
        "500"(view:'/error')
    }
}
