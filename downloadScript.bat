@echo off 

# search  any desire package 
winget search <This is an example>
winget search spotify 
# after we get the results we can install packages by name or id , as we all now id is more reliable 
#installing by name 
winget install  --name Spoify 

#installing by id
winget install --id Spotify.Spotify



start notepad 

