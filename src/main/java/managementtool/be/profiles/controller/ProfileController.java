package managementtool.be.profiles.controller;

import generated.managementtool.be.profile.api.ProfilesApi;
import generated.managementtool.be.profile.dto.Profiles;
import lombok.AllArgsConstructor;
import managementtool.be.profiles.mapper.ProfileMapper;
import managementtool.be.profiles.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ProfileController implements ProfilesApi {

    private ProfileService profileService;

    @Override
    public ResponseEntity<Profiles> profilesGet() {
        return ResponseEntity.ok( ProfileMapper.mapModelToDto( profileService.getProfiles() ) );
    }
}
