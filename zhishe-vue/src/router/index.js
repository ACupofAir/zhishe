import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../pages/zhishe/home.vue'
import College from "@/pages/zhishe/college";
import Campus from "@/pages/zhishe/campus";
import Comment from "@/pages/zhishe/comment";
import AdminHome from "@/pages/admin/adminHome";
import AdminList from "@/pages/admin/adminList";
import AdminLogin from "@/pages/admin/adminLogin";
import Check from "@/pages/admin/check";
import CollegeManage from "@/pages/admin/collegeManage";
import Log from "@/pages/admin/log";

Vue.use(VueRouter)

const routes = [
  {
    path: '/home',
    name: 'Home',
    component: Home
  },
  {
    path: '/college',
    name: 'College',
    component: College
  },
  {
    path: '/campus',
    name: 'Campus',
    component: Campus
  },
  {
    path: '/comment',
    name: 'Comment',
    component: Comment
  },
  {
    path: '/adminHome',
    name: 'AdminHome',
    component: AdminHome
  },
  {
    path: '/adminList',
    name: 'AdminList',
    component: AdminList
  },
  {
    path: '/adminLogin',
    name: 'AdminLogin',
    component: AdminLogin
  },
  {
    path: '/check',
    name: 'Check',
    component: Check
  },
  {
    path: '/collegeManage',
    name: 'CollegeManage',
    component: CollegeManage
  },
  {
    path: '/log',
    name: 'Log',
    component: Log
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
