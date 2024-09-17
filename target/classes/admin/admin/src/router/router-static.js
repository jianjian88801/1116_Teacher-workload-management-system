import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import daka from '@/views/modules/daka/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gonggao from '@/views/modules/gonggao/list'
    import gongzi from '@/views/modules/gongzi/list'
    import gongzuoliang from '@/views/modules/gongzuoliang/list'
    import togzhi from '@/views/modules/togzhi/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryGongzuoliang from '@/views/modules/dictionaryGongzuoliang/list'
    import dictionaryGongzuoliangYesno from '@/views/modules/dictionaryGongzuoliangYesno/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryTogzhi from '@/views/modules/dictionaryTogzhi/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryGongzuoliang',
        name: '工作量类型',
        component: dictionaryGongzuoliang
    }
    ,{
        path: '/dictionaryGongzuoliangYesno',
        name: '状态',
        component: dictionaryGongzuoliangYesno
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryTogzhi',
        name: '通知类型',
        component: dictionaryTogzhi
    }


    ,{
        path: '/daka',
        name: '打卡',
        component: daka
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/gonggao',
        name: '公告信息',
        component: gonggao
      }
    ,{
        path: '/gongzi',
        name: '工资',
        component: gongzi
      }
    ,{
        path: '/gongzuoliang',
        name: '工作量',
        component: gongzuoliang
      }
    ,{
        path: '/togzhi',
        name: '通知信息',
        component: togzhi
      }
    ,{
        path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
