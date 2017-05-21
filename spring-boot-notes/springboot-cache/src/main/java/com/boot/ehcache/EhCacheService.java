package com.boot.ehcache;

import java.util.Date;
import java.util.List;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import com.boot.User;
import com.boot.Utils;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EhCacheService {
	
	@Cacheable(value = "extCache", key = "'userlist'")
	public List<User> queryUsers() {
		return Utils.generate();
	}
	
	@Cacheable(value = "extCache", key = "'user'+#id")
	public User queryUser(long id) {
		log.info("@Cacheable"+id);
		return Utils.single(id);
	}
	
	@CacheEvict(value = "extCache", key = "'userlist'")
	public boolean clearCache() {
		return true;
	}
	
	@CacheEvict(value = "extCache", allEntries = true)
	public boolean clearAllCache() {
		return true;
	}
	
	@CachePut(value = "extCache", key = "'user'+#id")
    public User save(long id) {
		log.info("@CachePut"+id);
		User user = Utils.single(id);
		user.setName("putcache");
        return user;
    }
	
	@CacheEvict(value = "extCache", key = "'user'+#id")
	public boolean remove(long id) {
		return true;
	}
	
	@Caching(
            put = {
                    @CachePut(value = "extCache", key = "'user'+#user.id"),
                    @CachePut(value = "extCache", key = "#user.name", condition = "#result != null")
            }
    )
	public User login(User user) {
		remove(user.getId());
		user.setLoginTime(new Date(System.currentTimeMillis()));
		return user;
	}
	
	
}
