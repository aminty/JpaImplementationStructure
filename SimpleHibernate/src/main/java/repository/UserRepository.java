package repository;

import base.repository.BaseRepository;
import entity.User;

public interface UserRepository extends BaseRepository<User,Long> {

    User findUserByUsername(String username);
}
