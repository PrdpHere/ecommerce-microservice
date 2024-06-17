# ecommerce-microservice

Basic Query and Mutation for Product Catalog:
query test{
    testCheckMSGQL
}

mutation addProducts{
  addProduct(
    productInput:{
      productId:1
      name:"Sephora Tint"
      description:"Nithya makes this beautiful"
      price:1
      stockQuantity:1
    }
  ){
    productId
    name
  }
}

query getProductById{
  getProductById(productId:2){
    productId
    name
    description
  }
}

query getAllProducts{
  getAllProducts{
    productId
    name
    description
  }
}
