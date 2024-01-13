package io.getarrays.api.init;

import io.getarrays.api.entity.Account;
import io.getarrays.api.entity.Role;
import io.getarrays.api.repository.AccountRepository;
import io.getarrays.api.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class ApplicationStartRunner implements CommandLineRunner {
    private final RoleRepository roleRepository;
    private final AccountRepository accountRepository;

    @Override
    public void run(String ...args) throws Exception {
//        Role roleUser = new Role(1L, "123", "ROLE_USER");
//        Role roleAdmin = new Role(2L, "456", "ROLE_ADMIN");
//        roleUser = roleRepository.save(roleUser);
//        roleAdmin = roleRepository.save(roleAdmin);
//
//        Account superUser = new Account();
//        superUser.setCredentialsexpired(false);
//        superUser.setLocked(false);
//        superUser.setPassword(new BCryptPasswordEncoder().encode("123"));
//        superUser.setUsername("super_user");
//        superUser.setRoles(Set.of(roleAdmin, roleUser));
//
//        accountRepository.save(superUser);
//
//        Account admin = new Account();
//        admin.setCredentialsexpired(false);
//        admin.setLocked(false);
//        admin.setPassword(new BCryptPasswordEncoder().encode("123"));
//        admin.setUsername("admin");
//        admin.setRoles(Set.of(roleAdmin));
//
//        accountRepository.save(admin);
//
//
//        Account user = new Account();
//        user.setCredentialsexpired(false);
//        user.setLocked(false);
//        user.setPassword(new BCryptPasswordEncoder().encode("123"));
//        user.setUsername("user");
//        user.setRoles(Set.of(roleUser));
//
//        accountRepository.save(user);

    }
}
