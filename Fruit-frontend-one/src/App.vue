<template>
  <div id="app">
    <div id="nav">
      <router-link to="/add">添加数据</router-link> |
      <router-link to="/table">数据管理</router-link> 
    </div>
    <div style="display: flex; justify-content: center;">
      <!-- 视图都在里面 -->
      <router-view/>
    </div>
  </div>
</template>

<script>

  export default {
    name: 'app'
  }
</script>

<style>
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
  }

  #nav {
    padding: 30px;
  }

  #nav a {
    font-weight: bold;
    color: #2c3e50;
  }

  #nav a.router-link-exact-active {
    color: #42b983;
  }
</style>
