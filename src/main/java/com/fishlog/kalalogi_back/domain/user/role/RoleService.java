package com.fishlog.kalalogi_back.domain.user.role;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private RoleRepository roleRepository;


    public Role getByRoleId(int i) {
        return RoleRepository.findById(2).get();
    }
}
