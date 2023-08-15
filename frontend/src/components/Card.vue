<template xmlns:text-decoration="http://www.w3.org/1999/xhtml">
  <div class="card shadow-sm">
    <span class="img" :style="{backgroundImage: `url(${item.imgPath})`}"/>
    <div class="card-body">
        <p class="card-text">
          <span>{{ item.name }}&nbsp;</span>

          <span class="discount badge bg-danger">
            {{ lib.getNumberFormatted(item.discountPer) }}%
          </span>
        </p>
      <div class="d-flex justify-content-between align-items-center">
        <div class="btn-group">
        <button class="btn btn-primary" @click="addToCart(item.id)">
            <i class="fa fa-shopping-cart" aria-hidden="true"></i>
          </button>
        </div>
        <small class="price text-muted" style="text-decoration: line-through;">
          {{ lib.getNumberFormatted(item.price) }}원
        </small>
        <small class="real text-danger">
          {{ lib.getNumberFormatted(item.price - (item.price * item.discountPer / 100)) }}원
        </small>
      </div>
    </div>
  </div>
</template>
<script>
import lib from "@/script/lib";
import axios from "axios";

export default {
  name: "Card",
  props: {
    item: Object
  },
  setup() {
    // eslint-disable-next-line no-unused-vars
    const addToCart = (itemId)=>{
      // eslint-disable-next-line no-unused-vars
      axios.post(`/api/cart/items/${itemId}`).then((res)=>{
        console.log(itemId);
        console.log("success");
      })
    };
    return {lib,addToCart}
  }
}
</script>
<style scoped>
.card .img {
  display: inline-block;
  width: 100%;
  height: 250px;
  background-size: cover;
  background-position: center;
}
</style>