#!/bin/ksh

export ENDPOINT="/restConnect/rest/openADRPost/event"

if [ "$REST_URI" = "" ] ; then
  echo "Please do : export REST_URI=http:..."
fi

echo "Sending post to $REST_URI$ENDPOINT"
curl -v -F "fileupload=@eventState.xml" $REST_URI$ENDPOINT
curl -v -F "fileupload=@badEvent.xml" $REST_URI$ENDPOINT
echo "...complete"
