import {createApp} from 'vue'
import store from '@/script/store'
import App from './App.vue'
import router from "@/script/router";

createApp(App).use(store).use(router).mount('#app')
