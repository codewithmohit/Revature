import { TestBed } from '@angular/core/testing';

import { PlayerService } from './player-service.service';

describe('PlayerServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PlayerService = TestBed.get(PlayerService);
    expect(service).toBeTruthy();
  });
});
