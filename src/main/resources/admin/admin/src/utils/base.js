const base = {
    get() {
        return {
            url : "http://localhost:8080/jiaoshigongzuoliang/",
            name: "jiaoshigongzuoliang",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/jiaoshigongzuoliang/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "教师工作量管理系统"
        } 
    }
}
export default base
