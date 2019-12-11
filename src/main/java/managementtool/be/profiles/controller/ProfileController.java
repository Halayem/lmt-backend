package managementtool.be.profiles.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import generated.managementtool.be.profile.api.ProfilesApi;
import generated.managementtool.be.profile.dto.Profiles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import managementtool.be.profiles.mapper.ProfileMapper;
import managementtool.be.profiles.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@AllArgsConstructor
@Getter
@RestController
public class ProfileController implements ProfilesApi {

    private final ProfileService                profileService;
    private final Optional<ObjectMapper>        objectMapper;
    private final Optional<HttpServletRequest>  request;
    @Override
    public ResponseEntity<Profiles> profilesGet() {
        return ResponseEntity.ok( ProfileMapper.mapModelToDto( profileService.getProfiles() ) );
    }
}
