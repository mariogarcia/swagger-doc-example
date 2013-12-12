class UrlMappings {
    static mappings = {
        "/api/dummy" (resources:"dummyApi")
        "/"(view:"/index")
        "500"(view:'/error')
    }
}
