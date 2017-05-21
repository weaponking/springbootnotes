package com.boot;

public class CacheCase {

//    @Cacheable triggers cache population //入口
//		As the name implies, @Cacheable is used to demarcate methods that are cacheable - that is, 
//			methods for whom the result is stored into the cache 
//				so on subsequent invocations (with the same arguments), 
//					the value in the cache is returned without having to actually execute the method.
	
	  //用于限定可缓存的方法 使用相同的参数 返回缓存中的值 而不必实际执行该方法
	
//    @CacheEvict triggers cache eviction  //逐出
	
//    @CachePut updates the cache without interfering with the method execution
//		For cases where the cache needs to be updated without interfering with the method execution, 
//			one can use the @CachePut annotation. That is, 
//				the method will always be executed and its result placed into the cache 
//					(according to the @CachePut options). It supports the same options 
//					as @Cacheable and should be used for cache population rather than method flow optimization
	
	  //the method will always be executed and its result placed into the cache
	  //方法总是被执行并且和它结果存入缓存
	
//    @Caching regroups multiple cache operations to be applied on a method
	
//    @CacheConfig shares some common cache-related settings at class-level 
	
	
}
