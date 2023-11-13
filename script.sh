echo "Hello"
echo "repo is cloned"
var=$TEST_ENV
if [[ $var == "" ]]; then
echo "no env variable TEST_ENV"
echo "failing the job"
exit -1;
fi
echo "env variable TEST_ENV exists"
exit 0;
